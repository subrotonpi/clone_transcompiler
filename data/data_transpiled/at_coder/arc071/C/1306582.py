def import cin , sys
class Main ( object ) :
    def ni ( self ) : return cin ( )
    def nl ( self ) : return cin ( )
    def line ( self ) : return cin ( )
    def println ( self , str ) : print ( str )
    def print ( self , str ) : print ( str )
MOD = 1000000007
def cin ( ) :
    with open ( '/dev/null' , 'r' ) as f :
        output = f.read ( )
    def solve ( ) :
        S , T = line ( )
        sums = [ ]
        sumt = [ ]
        sums.append ( S [ 0 ] - 'A' + 1 )
        for i in range ( 1 , len ( S ) ) :
            sums.append ( sums [ i ] + S [ i ] - 'A' + 1 )
        sumt.append ( T [ 0 ] - 'A' + 1 )
        for i in range ( 1 , len ( T ) ) :
            sumt.append ( sumt [ i ] + T [ i ] - 'A' + 1 )
        N = ni ( )
        for a , b , c , d in zip ( sums , sumt , N ) :
            if ( sums [ b ] - sums [ a - 1 ] ) % 3 == ( sumt [ d ] - sumt [ c - 1 ] ) % 3 :
                print ( 'YES' )
            else :
                print ( 'NO' )
