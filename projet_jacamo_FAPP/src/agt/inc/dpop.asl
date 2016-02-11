// Agent dpop in project projet_jacamo_FAPP

/* Initial beliefs and rules */

/* Initial goals */
!findparent.
!findpseudoparent.
!findchildren.
!findpseudochildren.
!do_calcule_costfunction.
!send_my_costfunction.
!send_message_value.


/* Plans */
// Initialization parent pseudoparent children pseudochildren.
+!findparent:true <- ?parent(Parent);.print("my parent is ",Parent).
+!findpseudoparent:true <-?pseudoparent(Pseudoparent);.print("my Pseudoparent is ",Pseudoparent).
+!findchildren:true<-?children(Children);.print("my children is ",Children).
+!findpseudochildren:true<-?pseudochildren(Pseudochildren);.print("my pseudochildren is ",Pseudochildren).

@send_my_costfunction1
+!send_my_costfunction:children(Children)&Children==0&pseudochildren(Pseudochildren)&Pseudochildren==0 <-?parent(Parent);.send(Parent,tell,cost_function).

@send_my_costfunction2
+!send_my_costfunction:parent(Parent)&Parent\==0 <-?parent(Parent);.send(Parent,tell,cost_function).

@do_calcule_costfunction1
+!do_calcule_costfunction:children(Children)&Children==0&pseudochildren(Pseudochildren)&Pseudochildren==0 <- .print("here is calcule cost fonction").

@do_calcule_costfunction2
+!do_calcule_costfunction:children(Children)&cost_function[source(Children)] <- .print("here is calcule cost fonction").

@do_calcule_my_value1
+!do_calcule_my_value:parent_value(Parent_value) <- .print("here is calcule my value fonction");?parent_value(Parent_value);My_value=Parent_value;+my_value(My_value).

@do_calcule_my_value2
+!do_calcule_my_value:pseudoparent_value(Pseudoarent_value) <- .print("here is calcule my value fonction").

@send_message_value1
+!send_message_value:parent(Parent)&Parent==0&children(Children) <-?my_value(My_value);Parent_value=My_value;Pseudoparent_value=My_value;?children(Children);.send(Children,tell,parent_value(Parent_value));?pseudochildren(Pseudochildren);.send(Pseudochildren,tell,pseudoparent_value(Pseudoparent_value)).

@send_message_value2
+!send_message_value:parent_value(Parent_value)[source(Parent)]&children(Children)&Children\==0&pseudochildren(Pseudochildren)&Pseudochildren\==0 <-?my_value(My_value);Parent_value=My_value;Pseudoparent_value=My_value;?children(Children);.send(Children,tell,parent_value(Parent_value));?pseudochildren(Pseudochildren);.send(Pseudochildren,tell,pseudoparent_value(Pseudoparent_value)).

@send_message_value3
+!send_message_value:parent_value(Parent_value)[source(Parent)]&children(Children)&Children\==0&pseudochildren(Pseudochildren)&Pseudochildren==0 <-?my_value(My_value);Parent_value=My_value;Pseudoparent_value=My_value;?children(Children);.send(Children,tell,parent_value(Parent_value));?pseudochildren(Pseudochildren).

+cost_function[source(A)] <- .print("I received a 'cost-function' from ",A);!send_my_costfunction;!do_calcule_costfunction.
+parent_value(Parent_value)[source(P)] <-.print("I received my parent value from ",P);!do_calcule_my_value;!send_message_value.
+pseudoparent_value(Pseudoparent_value)[source(PP)] <-.print("I received my pseudoparent value from ",PP);!do_calcule_my_value;!send_message_value.
+my_value(My_value)<-.print("my value = ",My_value).
