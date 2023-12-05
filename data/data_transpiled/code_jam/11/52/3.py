def _import ( ) :
    from os import getenv
    import re
    class B ( object ) :
        def __init__ ( self ) :
            self.file_name = re.sub ( '_.*' , '' , self.file_name ).lower ( )
            self.input_file_name = self.file_name + '.in'
            self.output_file_name = self.file_name + '.out'
        def solve ( self ) :
            n = self.n
            if n == 0 :
                self.out.write ( 0 )
                return
            a = [ self.input_file_name ] * n
            a.sort ( )
            low = 0
            high = self.n + 1
            while low + 1 < high :
                m = ( low + high ) / 2
                ok = True
                open = [ ]
                for v in range ( a [ 0 ] , a [ n - 1 ] + 1 ) :
                    k = 0
                    for i in range ( n ) :
                        if a [ i ] == v :
                            k += 1
                    for i in range ( len ( open ) ) :
                        open [ i ] = open [ i ] + 1
                    else :
                        if len ( open ) < m :
                            ok = False
                            break
                        else :
                            while i < len ( open ) :
                                open.pop ( )
                            break
            while k > 0 :
                open.append ( 1 )
                k -= 1
            open.sort ( )
        if ok :
            low = m
        else :
            high = m
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( sys.argv ) >= 2 :
            input_file_name = sys.argv [ 1 ]
            output_file_name = sys.argv [ 2 ]
        f = open ( input_file_name , 'r' )
        f.write ( 'Case #%d: ' % t )
        with open ( output_file_name , 'w' ) as out :
            tests = f.read ( )
            f.write ( 'Case #%d: solved\n' % t )
    main ( )
