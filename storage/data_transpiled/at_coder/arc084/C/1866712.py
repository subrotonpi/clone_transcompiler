def import sys , getopt
class Main ( object ) :
    def __init__ ( self ) :
        self._mid = [ ]
    def __repr__ ( self ) :
        Mid = [ ]
        for i in self._mid :
            Mid.append ( "%s " % i )
        print ( Mid , end = "" )
    def Even ( self , K , N ) :
        array_mid = [ ]
        array_mid.insert ( 0 , K // 2 )
        for i in range ( 1 , N ) :
            array_mid.insert ( i , K )
        print ( "\n".join ( Mid ) )
    def Odd ( self , K , N ) :
        array_mid = [ ]
        for i in range ( N ) :
            array_mid.insert ( i , ( K + 1 ) // 2 )
        for i in range ( N // 2 ) :
            if array_mid [ - 1 ] == 1 :
                array_mid.pop ( )
            else :
                array_mid [ ( - 1 ) ] = array_mid [ - 1 ] - 1
                for j in range ( len ( array_mid ) ) :
                    array_mid.insert ( j , K )
        print ( "\n".join ( Mid ) )
    def Judge ( self , K , N ) :
        if K % 2 == 0 :
            self.Even ( K , N )
        else :
            self.Odd ( K , N )
    def main ( self ) :
        input = sys.stdin
        out = [ ]
        for i in range ( 2 ) :
            out.append ( input.read ( ) )
        my_encyclopedia = Main ( )
        my_encyclopedia.Judge ( out [ 0 ] , out [ 1 ] )
        input.close ( )
