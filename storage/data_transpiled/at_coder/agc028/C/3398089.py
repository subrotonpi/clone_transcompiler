def _import ( ) : return int ( )
import time
import sys
import os
import sys
import tokenize
import tokenize
import tokenize
import tokenize
try :
    f = open ( sys.stdin )
except NameError :
    sys.stderr.write ( 'File not found: %s\n' % sys.stdin.read ( ) )
    return 1
else :
    try :
        tokenize.tokenize ( f.readline )
    except NameError :
        sys.stderr.write ( 'File not found: %s\n' % sys.stdin.read ( ) )
        return 1
def solve ( ) :
    n = scanInt ( )
    a , b = [ ] , [ ]
    tokens = [ ]
    for i in range ( n ) :
        a.append ( tokens [ i ] = tokenize.lex ( scanInt ( ) , i , False ) )
        b.append ( tokens [ i + n ] = tokenize.lex ( scanInt ( ) , i , True ) )
    sort ( tokens )
    sum = 0
    for i in range ( n ) :
        sum += tokens [ i ].value
    for i in range ( n , 2 * n ) :
        tokens [ i ].is_big = True
    c1 , c2 , c3 = 0 , 0 , 0
    for i in range ( n ) :
        if not a [ i ].is_big and b [ i ].is_big :
            c1 += 1
        elif a [ i ].is_big and not b [ i ].is_big :
            c3 += 1
        else :
            c2 += 1
    if c2 == 0 and c1 != 0 and c3 != 0 :
        if tokens [ n - 1 ].id != tokens [ n ].id or ( c1 == 1 and tokens [ n ].is_big == tokens [ n ].is_big ) or ( c3 == 1 and tokens [ n ].is_big != tokens [ n ].is_big ) :
            sum += tokens [ n ].value - tokens [ n - 1 ].value
    return sum
