def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os.path import expanduser
    from os.path import join
    from os.path import join
    class A_part_elf ( ) :
        def gcd ( self , x , y ) :
            while 1 :
                r = x % y
                if r == 0 :
                    return y
                x , y = y , r
        def solve ( self , sc , pw ) :
            s = sc.readline ( )
            a = s.split ( '/' )
            p = int ( a [ 0 ] )
            q = int ( a [ 1 ] )
            g = self.gcd ( p , q )
            p /= g
            q /= g
            if q != int ( q ) :
                pw.write ( 'impossible' )
                return
            for i in range ( 0 ) :
                if ( 1l << i ) * p >= q :
                    pw.write ( i )
                    return
    def main ( * args ) :
        fname = getenv ( 'A-large' )
        with open ( fname + '.in' , 'r' ) as sc , open ( fname + '.out' , 'w' ) as pw :
            t = sc.readline ( )
            sc.readline ( )
            for i in range ( 1 , t + 1 ) :
                print ( i )
                pw.write ( 'Case #%d: ' % i )
                A_part_elf ( ).solve ( sc , pw )
    main ( )
