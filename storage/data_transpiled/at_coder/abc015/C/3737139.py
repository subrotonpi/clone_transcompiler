def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.usage = sys.argv [ 0 ]
        def __call__ ( self , * args , ** kwargs ) :
            with open ( self.usage , 'r' ) as f :
                line = f.readline ( ).split ( )
                n = int ( line [ 0 ] )
                k = int ( line [ 1 ] )
                problems = [ [ int ( x ) for x in line [ n : k ] ] for line in f.readlines ( ) ]
                last = 1
                for i in range ( n ) :
                    last *= k
                found = False
                for selection in range ( last ) :
                    xor = 0
                    i_pow_kprev = 1
                    i_pow_k = 1
                    for i in range ( n ) :
                        i_pow_k *= k
                        j = ( selection % i_pow_k ) // i_pow_kprev
                        xor ^= problems [ i ] [ j ]
                        i_pow_kprev = i_pow_k
                    if xor == 0 :
                        found = True
                        break
                if found :
                    self.usage = "Found"
                else :
                    self.usage = "Nothing"
    Main ( )
