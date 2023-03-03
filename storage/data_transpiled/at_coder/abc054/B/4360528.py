def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        with open ( "../../../api/" ) as sc :
            N , M = [ int ( i ) for i in sc.read ( ).split ( "\n" ) ]
            A = [ ]
            for i in range ( N ) :
                A.append ( sc.read ( ) )
            B = [ ]
            for i in range ( M ) :
                B.append ( sc.read ( ) )
            for i in range ( 0 , M + N ) :
                for j in range ( 0 , M + N ) :
                    yes = True
                    for k in range ( M ) :
                        yes = yes and ( A [ i + k ] [ j : j + M ] == B [ k ] )
                    if yes :
                        print ( "Yes" )
                        return
            print ( "No" )
