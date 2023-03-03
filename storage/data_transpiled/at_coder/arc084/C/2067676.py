def _import ( ) :
    from pyencyclopedia import Main
    class Main ( object ) :
        def __init__ ( self , array_mid ) :
            self.Mid = [ ]
            for i in array_mid :
                self.Mid.append ( i + " " )
            print ( self.Mid )
        def Even ( self , K , N ) :
            array_mid = [ ]
            array_mid.insert ( 0 , K // 2 )
            for i in range ( 1 , N ) :
                array_mid.insert ( i , K )
            print ( self.Mid )
        def Odd ( self , K , N ) :
            array_mid = [ ]
            for i in range ( N ) :
                array_mid.insert ( i , ( K + 1 ) // 2 )
            for i in range ( N // 2 ) :
                if array_mid [ - 1 ] == 1 :
                    del array_mid [ - 1 ]
                else :
                    array_mid [ ( - 1 ) ] = array_mid [ - 1 ] - 1
                    for j in range ( len ( array_mid ) , N ) :
                        array_mid.insert ( j , K )
            print ( self.Mid )
        def Judge ( self , K , N ) :
            if K % 2 == 0 :
                self.Even ( K , N )
            else :
                self.Odd ( K , N )
    def main ( ) :
        input = sys.stdin
        out = [ ]
        for i in range ( 2 ) :
            out.append ( input.read ( ) )
        my_encyclopedia = Main ( )
        my_encyclopedia.Judge ( out [ 0 ] , out [ 1 ] )
        input.close ( )
