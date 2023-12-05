def import _BigInteger
import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.split ( sys.stdin.read ( ) )
        n = int ( sc )
        a = [ int ( i ) for i in sc ]
        a.sort ( key = lambda x : x [ 1 ] )
        edge1 , edge2 = None , None
        index = 0
        for i in range ( 1 , n ) :
            if a [ i ] == a [ i - 1 ] :
                if edge1 is None :
                    edge1 = a [ i ]
                    index = i
                elif edge2 is None and index != i - 1 :
                    edge2 = a [ i ]
                    break
        ans = BigInteger ( str ( edge1 ) ) * BigInteger ( str ( edge2 ) )
        print ( ans )
