def import import sys , string
import sys
import string
import sys
import string
import sys
import string
import sys
import string
import sys
import string
import string
import sys
import string
import string
import sys
import string
import string
import string
import string
import string
import sys
import getopt
try :
    from getopt import getopt as getopt
except ImportError :
    print ( "No getopt" )
    return
try :
    n , a , b = getopt.getopt ( sys.argv [ 1 : ] , 'n:a' )
    if int ( a ) ^ int ( b ) % 2 == 0 :
        print ( "NO" )
        return
    print ( "YES" )
    ans = [ ]
    solve ( a , b , ( 1 << n ) - 1 )
    check = True
    for i in range ( ( 1 << n ) - 1 ) :
        print ( ans [ i ] , end = ' ' )
    print ( b )
def reverse ( ar , l , r ) :
    c = ( l + r ) // 2 - l
    for i in range ( c ) :
        tmp = ar [ l + i ]
        ar [ l + i ] = ar [ r - i ]
        ar [ r - i ] = tmp
def solve ( A , B , mask ) :
    if int ( mask ) == 1 :
        ans.append ( A )
        ans.append ( B )
        return
    div = - 1
    for i in range ( n ) :
        if ( ( ( A ^ B ) & mask ) & ( 1 << i ) ) :
            div = i
        mask ^= 1 << div
        c = mask & ( - mask )
        C = A ^ c
        solve ( A , C , mask )
        solve ( C ^ ( 1 << div ) , B , mask )
def debug ( * os ) :
    print ( string.join ( map ( str , os ) , "" ) , file = sys.stderr )
