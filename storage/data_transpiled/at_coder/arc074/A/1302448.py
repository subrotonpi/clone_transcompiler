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
        return "%s" % ( res )
    def solve ( ) :
        if not H % 3 or not W % 3 :
            return 0
        return min ( cal ( H , W ) , cal ( W , H ) )
    def cal ( h , w ) :
        res = sum ( [ ( i , w ) for i in range ( h // 3 , h // 2 + 1 ) ] )
        res = min ( res , W )
        for i in range ( h // 3 , h // 2 + 1 ) :
            a = [ ( i , w ) * w , ( h - i ) * ( w // 2 , w - i ) * ( w - w // 2 ) ]
            a.sort ( )
            res = min ( res , a [ 2 ] - a [ 0 ] )
        return int ( res )
