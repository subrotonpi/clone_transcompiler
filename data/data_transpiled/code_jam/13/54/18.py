def _import ( ) :
    from sys import stdin
    from .util import solve
    class D ( object ) :
        def check ( self , e ) :
            if not e :
                raise Error ( )
        def solve ( self , pattern ) :
            pattern = pattern.replace ( '.' , '' )
            self.money = [ ]
            for code in range ( 1 , ( 1 << len ( pattern ) ) + 1 ) :
                first_empty_shift = - 1
                for shift in range ( len ( pattern ) ) :
                    if ( ( code >> shift ) & 1 ) == 1 :
                        first_empty_shift = shift
                        break
                self.check ( first_empty_shift != - 1 )
                occupied_count = 0
                cur_money = 0
                for shift in range ( first_empty_shift + 1 , len ( pattern ) ) :
                    if ( ( code >> shift ) & 1 ) == 0 :
                        occupied_count += 1
                    else :
                        cur_money += money [ code - ( 1 << shift ) ] * ( occupied_count + 1 ) + ( len ( pattern ) - occupied_count ) * ( occupied_count + 1 ) / 2
                        occupied_count = 0
                for shift in range ( 0 , first_empty_shift ) :
                    if ( ( code >> shift ) & 1 ) == 0 :
                        occupied_count += 1
                    else :
                        cur_money += money [ code - ( 1 << shift ) ] * ( occupied_count + 1 ) + ( len ( pattern ) - occupied_count ) * ( occupied_count + 1 ) / 2
                        occupied_count = 0
                self.check ( occupied_count == 0 )
                money.append ( cur_money / len ( pattern ) )
            code = 0
            for i in range ( len ( pattern ) ) :
                if pattern [ i ] == '.' :
                    code |= 1 << i
                else :
                    self.check ( pattern [ i ] == 'X' )
            return money [ code ]
        def solve ( self , pattern ) :
            n_tests = len ( pattern )
            for i in range ( 1 , n_tests + 1 ) :
                print ( 'Case #%d: %s' % ( i , solve_one ( pattern [ i ] ) ) )
