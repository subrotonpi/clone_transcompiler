def _import ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline.parse_file
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import readline.parse_line
import tokenize
class Main ( object ) :
    def solve ( self ) :
        ans = 0
        n = self.ni ( )
        a = readline.parse_line ( readline.strip ( ) )
        if a [ 0 ] != 0 :
            return - 1
        for i in range ( 1 , n ) :
            if a [ i ] - a [ i - 1 ] > 1 :
                return - 1
        for i in range ( n - 1 , - 1 , - 1 ) :
            ans += a [ i ]
            if a [ i ] > 0 :
                while i > 0 and a [ i ] - a [ i - 1 ] == 1 :
                    i -= 1
        return ans
    def ns ( self ) :
        while not readline.has_tab ( ) :
            readline.parse_line ( readline.strip ( ) )
        return readline.parse_line ( readline.strip ( ) )
    def ni ( self ) :
        return int ( self.ni ( ) )
    def nl ( self ) :
        return long ( self.nl ( ) )
    def nd ( self ) :
        return float ( self.nd ( ) )
    def nsa ( self , n ) :
        res = [ ns ( self ) for self in nsa ]
        return res
    def nia ( self ) :
        res = [ ni ( self ) for self in ni ( self ) ]
        return res
    def nla ( self ) :
        res = [ nl ( self ) for self in nla ]
        return res
