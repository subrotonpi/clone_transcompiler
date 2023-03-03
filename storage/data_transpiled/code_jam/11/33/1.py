def _import ( ) :
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    import sympy
    class C ( builtins ) :
        def __init__ ( self , * args ) :
            builtins.__init__ ( self )
            self.args = args
        def __repr__ ( self ) :
            return 'Case #%d: ' % ( self.args [ 0 ] + 1 )
    def solve ( self ) :
        AAA = - 1
        n = len ( self.args )
        l = len ( self.args )
        h = len ( self.args )
        a = [ self.args [ 0 ] for self in self.args ]
        a.sort ( )
        gcd_all = [ a [ - 1 ] ]
        for i in range ( n - 2 , - 1 , - 1 ) :
            gcd_all [ i ] = GCD ( gcd_all [ i + 1 ] , a [ i ] )
        nok = 1
        for i in range ( n ) :
            if nok <= gcd_all [ i ] and gcd_all [ i ] % nok == 0 :
                y = gcd_all [ i ] / nok
                for q in range ( 1 , 2 ) :
                    if y % q == 0 :
                        for u in range ( 2 ) :
                            if u == 0 :
                                mult = q
                            else :
                                mult = y / q
                            ans = nok * mult
                            if ans >= l and ans <= h :
                                if not AAA or self.args [ u ] > ans :
                                    self.args [ u ] = ans
                                    break
                            else :
                                self.args [ u ] = new_nok [ i ]
    _nok = sympy.Integer ( nok )
    _a = sympy.Integer ( a [ 0 ] )
    new_nok = _nok * ( _a / _nok )
    if new_nok > h :
        nok = h + 1
        break
    else :
        nok = new_nok
