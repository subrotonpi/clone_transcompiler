def import sys , out
import string
import string
import sys
import string
import string
import string
import string
import string
import string
SDash = string.split ( string.punctuation )
T = string.split ( string.punctuation )
S = SDash.split ( )
is_restorable = False
for i in range ( len ( S ) - 1 , - 1 , - 1 ) :
    is_restorable_tmp = True
    for j in range ( len ( T ) ) :
        if not ( i + j < len ( S ) and ( S [ i + j ] == '?' or S [ i + j ] == T [ j ] ) ) :
            is_restorable_tmp = False
            break
    if is_restorable_tmp :
        for j in range ( len ( T ) ) :
            S [ i + j ] = T [ j ]
        is_restorable = True
        break
if is_restorable :
    for i in range ( len ( S ) ) :
        if S [ i ] == '?' :
            S [ i ] = 'a'
    out.write ( ''.join ( S ) )
else :
    out.write ( 'UNRESTORABLE' )
