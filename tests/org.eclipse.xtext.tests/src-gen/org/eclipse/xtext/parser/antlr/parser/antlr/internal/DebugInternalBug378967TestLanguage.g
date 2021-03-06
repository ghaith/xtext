/*
 * generated by Xtext
 */
grammar DebugInternalBug378967TestLanguage ;

// Rule Root
ruleRoot :
	'1' ruleRule1 |
	'2' ruleRule2 |
	'3' ruleRule3 |
	'4' ruleRule4
;

// Rule Rule1
ruleRule1 :
	ruleFirstEnum RULE_INT ruleSecondEnum
;

// Rule Rule2
ruleRule2 :
	'after' RULE_INT 's'
;

// Rule Rule3
ruleRule3 :
	ruleAfter RULE_INT ruleS
;

// Rule Rule4
ruleRule4 :
	ruleAfterObj RULE_INT ruleSObj
;

// Rule AfterObj
ruleAfterObj :
	'after'
;

// Rule SObj
ruleSObj :
	's'
;

// Rule After
ruleAfter :
	'after'
;

// Rule S
ruleS :
	's'
;

// Rule FirstEnum
ruleFirstEnum :
	'after'
;

// Rule SecondEnum
ruleSecondEnum :
	's'
;

RULE_ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_' |
		'0' .. '9'
	)*
;

RULE_INT :
	'0' .. '9'+
;

RULE_STRING :
	'"' (
		'\\' . |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' . |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

RULE_ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/' { skip(); }
;

RULE_SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)? { skip(); }
;

RULE_WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+ { skip(); }
;

RULE_ANY_OTHER :
	.
;