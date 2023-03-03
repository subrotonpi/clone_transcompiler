def _import ( ) :
    from sys import stdin , stdout
    from os import fdopen
    class Main ( object ) :
        def __init__ ( self , K , N , output ) :
            output.write ( K / 2 )
            for i in range ( 1 , N ) :
                output.write ( ' ' * K )
            output.write ( '\n' )
        def __init__ ( self , K , N , output ) :
            self.array_mid = [ ]
            for i in range ( N ) :
                self.array_mid.insert ( i , ( K + 1 ) / 2 )
            for i in range ( N / 2 ) :
                if self.array_mid [ - 1 ] <= 1 :
                    self.array_mid.pop ( )
                else :
                    self.array_mid [ ( self.array_mid [ - 1 ] , self.array_mid [ - 1 ] - 1 ) ] = self.array_mid [ - 1 ]
                    while len ( self.array_mid ) < N :
                        self.array_mid.append ( K )
            for i in self.array_mid :
                output.write ( self.array_mid [ i ] )
                if i < len ( self.array_mid ) - 1 :
                    output.write ( ' ' * ( N - i ) )
                else :
                    output.write ( '\n' )
    def main ( ) :
        input_file , output_file = sys.stdin , sys.stdout
        input = open ( input_file , 'r' )
        output = open ( output_file , 'w' )
        K , N = input.read ( ).split ( )
        if K % 2 == 0 :
            Even ( K , N , output )
        else :
            Odd ( K , N , output )
        input.close ( )
        output.close ( )
