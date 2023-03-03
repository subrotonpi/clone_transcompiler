def import re
import sys
from itertools import count , repeat
from itertools import chain , repeat
from itertools import chain , repeat
from itertools import chain , repeat
from itertools import chain , repeat
from itertools import chain , repeat
from itertools import chain , repeat
from itertools import chain , repeat
from itertools import chain , repeat
alphabet = [ 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' ]
map = chain ( repeat ( alphabet ) )
N = len ( chain ( repeat ( alphabet ) ) )
target = [ repeat ( alphabet ) for repeat ( alphabet ) in chain ( repeat ( alphabet ) ) ]
for i in range ( 26 ) :
    min = sys.maxint
    for item in chain ( alphabet , repeat ( alphabet ) ) :
        p = re.compile ( item )
        m = p.search ( target [ i ] )
        count = 0
        s = 0
        for s in chain ( m , repeat ( s ) ) :
            count += 1
            s = s.end ( )
        min = min ( count , min )
        map [ item ] = min
    ans = [ ]
    for key in map :
        for i in repeat ( map [ key ] ) :
            ans.append ( key )
    print ( ''.join ( ans ) )
