def import cin , sys
class Main ( object ) :
    def ni ( self ) : return cin ( )
    def nl ( self ) : return cin ( )
    def line ( self ) : return cin ( )
    def println ( self , str ) : print ( str )
    def print ( self , str ) : print ( str )
MOD = 1000000007
def cin ( ) :
    def input ( self ) :
        self.input ( )
        res = solve ( )
        output = "%s" % res
        return "%s" % output
    H , W = ni ( )
    def solve ( ) :
        if H % 3 == 0 or W % 3 == 0 :
            return 0
        return min ( cal ( H , W ) , cal ( W , H ) )
    def cal ( h , w ) :
        res = w
        for i in range ( h // 3 , h // 2 + 1 ) :
            a = [ ( i , w ) , ( h - i ) * ( w // 2 , w - w // 2 ) ]
            a.sort ( )
            res = min ( res , a [ 2 ] - a [ 0 ] )
        return int ( res )
