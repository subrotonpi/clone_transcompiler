def _import ( ) : return int ( next ( sys.stdin ) )
def main ( ) :
    fc = _import ( sys.stdin )
    N = fc ( )
    f = open ( '/dev/null' , 'w' )
    answer = solve ( )
    for i in range ( N ) :
        if i != 0 :
            f.write ( ' ' )
        f.write ( answer [ i ] )
    f.write ( '\n' )
    f.flush ( )
def solve ( ) :
    max_odd = 0
    for n in range ( 3 , 30000 + 1 ) :
        if n % 2 != 0 and ( n % 3 == 0 or n % 5 == 0 ) :
            max_odd += 1
    max_odd = max_odd // 2 * 2
    if N > max_odd :
        odd = max_odd
        even = N - max_odd
    else :
        if N % 2 == 0 :
            odd = N - 2
            even = 2
        else :
            odd = N - 1
            even = 1
    ans = [ ]
    all = 0
    i = 0
    for n in range ( 2 , 30000 + 1 ) :
        if n % 2 != 0 and ( n % 3 == 0 or n % 5 == 0 ) :
            ans.append ( n )
            all += n
            odd -= 1
            if odd == 0 :
                break
    for n in range ( 2 , 30000 + 1 , 2 ) :
        ans.append ( n )
        all += n
        even -= 1
        if even == 0 :
            break
    while True :
        if all % 3 == 0 and all % 5 == 0 :
            break
        else :
            all += 2
            ans.append ( 2 )
    ans.sort ( )
    return ans
from itertools import repeat
from random import choice
if not repeat :
    for i in range ( N ) :
        print ( next ( sys.stdin ) )
