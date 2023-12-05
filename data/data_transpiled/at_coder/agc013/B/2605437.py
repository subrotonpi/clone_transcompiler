def import _extend
from collections import deque
from collections import deque
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        sc = urandom ( )
        n = sc.randint ( 1 , 10000 )
        m = sc.randint ( 1 , 10000 )
        connect = [ [ ] for i in range ( n + 1 ) ]
        for a , b in zip ( sc.randint ( 1 , 10000 ) , sc.randint ( 1 , 10000 ) ) :
            connect [ a ].append ( b )
            connect [ b ].append ( a )
    taken = [ False ] * ( n + 1 )
    taken [ 1 ] = True
    ans = deque ( [ 1 ] )
    self.extend ( ans , connect , taken , False )
    self.extend ( ans , connect , taken , True )
    print ( len ( ans ) )
    ans = deque ( )
    for i in ans :
        ans.append ( i )
    ans.popleft ( )
    print ( ans )
