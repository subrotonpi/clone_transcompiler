def main ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = random.randint ( 0 , N )
            self.K = random.randint ( 0 , K )
            h_ = [ random.choice ( range ( N ) ) for _ in range ( self.N ) ]
            h_.sort ( )
            high = get_tree ( h_ , N , K )
            print ( high )
    def get_tree ( h , n , k ) :
        diff = h [ k - 1 ] - h [ 0 ]
        for i in range ( 1 , n - k + 1 ) :
            tmp = h [ i + k - 1 ] - h [ i ]
            if tmp < diff :
                diff = tmp
        return diff
    return Main ( )
