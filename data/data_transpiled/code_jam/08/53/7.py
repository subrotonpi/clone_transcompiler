def test_C_as ( ) :
    import locale
    import os
    import locale
    import locale
    import random
    class C_as ( locale.Base ) :
        def solve ( self ) :
            with open ( 'C-small-attempt0.in' , 'r' ) as infile :
                with open ( 'C-small-attempt0.out' , 'w' ) as outfile :
                    outfile.write ( 'Case #%d: %d\n' % ( self.test + 1 , self.ans ) )
    def solve ( self ) :
        try :
            self.solve ( )
        except locale.Error :
            sys.exit ( 1 )
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        os.chdir ( 'C-small-attempt0.out' )
    for test in range ( tn ) :
        m = random.randint ( 1 , n )
        a = [ [ ] for s in open ( 'C-small-attempt0.in' , 'r' ).read ( ) ]
        for s in open ( 'C-small-attempt0.out' , 'w' ).read ( ) :
            for j in range ( n ) :
                a [ i ] [ j ] = s == '.'
        b = [ [ ] for i in range ( m + 1 ) ]
        p = [ [ ] for i in range ( n ) ]
        q = [ [ ] for i in range ( n ) ]
        for i in range ( m ) :
            search :
                for j in range ( 1 << n ) :
                    tmp = j
                    for k in range ( n ) :
                        p [ k ] = tmp % 2 == 1
                        tmp /= 2
                    for k in range ( n ) :
                        if k < n - 1 and p [ k ] and p [ k + 1 ] :
                            continue search
                        if p [ k ] and ( i == 0 or not a [ i - 1 ] [ k ] ) :
                            continue search
                search2 :
                    for l in range ( 1 << n ) :
                        d = 0
                        tmp = l
                        for k in range ( n ) :
                            q [ k ] = tmp % 2 ==