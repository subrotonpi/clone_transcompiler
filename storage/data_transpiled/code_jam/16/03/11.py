def main ( ) :
    import os
    import random
    import sys
    import random
    import sys
    import sys
    class Round0C ( ) :
        def __init__ ( self ) :
            self.cases = 0
            self.primes = ( 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 )
        def divisor ( self , number , radix ) :
            num = int ( number , radix )
            for p in self.primes :
                if num % p == 0 :
                    return p
            return 0
    random.seed ( 1423444 )
    def rand ( length ) :
        buf = '1'
        for i in range ( 1 , length - 1 ) :
            buf += random.choice ( [ '1' , '0' ] )
        buf += '1'
        return buf
    def process ( self , out ) :
        self.cases = int ( self.cases )
        self.N = int ( self.N )
        self.J = int ( self.J )
        checked = set ( )
        moduli = [ ]
        for curcase in range ( 11 ) :
            out.write ( 'Case #%d:\n' % ( curcase + 1 ) )
            while J > 0 :
                number = rand ( N )
                if number in checked :
                    continue
                ok = True
                for radix in ( 2 , 10 ) :
                    moduli.append ( divisor ( number , radix ) )
                    if moduli [ radix ] == 0 :
                        ok = False
                        break
                if ok :
                    out.write ( number )
                    for radix in ( 2 , 10 ) :
                        out.write ( ' ' )
                        out.write ( moduli [ radix ] )
                    out.write ( '\n' )
                    J -= 1
                checked.add ( number )
    def round_file ( self ) :
        with open ( 'C:\\Users\\Olaf\\Downloads\\C-large.txt' , 'w' ) as f :
            f.write ( round_file ( self.cases ) )
