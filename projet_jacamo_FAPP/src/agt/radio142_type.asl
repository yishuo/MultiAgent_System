// Agent radio142_type in project projet_jacamo_FAPP

/* Initial beliefs and rules */
parent(radio141).
children(radio251).
pseudoparent(0).
pseudochildren(radio252).

/* Initial goals */
!start.

/* Plans */
+!start : true <- .print("radio142 is started.").


{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have a agent that always complies with its organization  
{ include("$jacamoJar/templates/org-obedient.asl") }
{ include("./inc/dpop.asl") }

