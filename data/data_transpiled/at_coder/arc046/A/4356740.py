def _ ( ) : return
import sys
import string
import string
import string
import set
class Main ( ) :
    def __init__ ( self ) :
        Scanner ( )
        n = int ( sys.stdin.readline ( ) )
        c = 1
        ans = [ ]
        i = 1
        while c <= n :
            if self.d ( i ) :
                ans.append ( i )
            i += 1
        self.out.write ( ans [ n ] )
    def d ( i ) :
        s = str ( i )
        k = set ( s )
        return len ( k ) == 1
