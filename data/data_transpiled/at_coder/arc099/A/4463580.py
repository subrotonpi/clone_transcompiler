def _import ( ) :
    from pybrain import process
    from pybrain import process
    class Main ( object ) :
        MINIMUM = 1
        def __init__ ( self ) :
            self.N = self.N
            self.K = self.K
            return str ( self.num_ops_needed ( K , self.N - 1 ) )
        def num_ops_needed ( self , k , count ) :
            return ( count + ( self.k - 1 ) - 1 ) / ( self.k - 1 )
    def main ( ) :
        case = read_from_input ( )
        result = process ( case )
        output ( result )
    def read_from_input ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            N = f.read ( )
            K = f.read ( )
            A = [ ]
            for i in range ( N ) :
                A.append ( f.read ( ) )
            return { 'N' : N , 'K' : K , 'A' : A }
    def output ( result ) :
        print ( result )
    class Main ( object ) :
        def __init__ ( self , N , K , A ) :
            self.N = N
            self.K = K
            self.A = A
    return Main
