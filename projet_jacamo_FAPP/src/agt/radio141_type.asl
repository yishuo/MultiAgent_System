// Agent radio141_type in project projet_jacamo_FAPP

/* Initial beliefs and rules */
parent(0).
children(radio142).
pseudoparent(0).
pseudochildren([radio251,radio252]).
my_value(100).

/* Initial goals */
!start.



/* Plans */
+!start : true <- .print("radio141 is started.").




{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have a agent that always complies with its organization  
{ include("$jacamoJar/templates/org-obedient.asl") }
{ include("./inc/dpop.asl") }

