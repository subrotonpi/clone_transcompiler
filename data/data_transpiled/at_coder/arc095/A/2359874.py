def _import ( ) : return '(' + str ( idx ) + ', ' + str ( val ) + ')'
class _InfoComp :
    def __init__ ( self , val ) :
        self.val = val
    def __init__ ( self , val ) :
        self.val = val
    def _int_max ( self ) :
        self.val = val
    def _int_min ( self ) :
        self.val = val
    def _long_max ( self ) :
        self.val = val
    def _long_min ( self ) :
        self.val = val
    def _solve ( self ) :
        n = self.read_num ( )
        ia = self.read_nums ( )
        l = [ ]
        for i in range ( n ) :
            l.append ( ( i , ia [ i ] ) )
        l.sort ( key = _info_comp )
        s1 = set ( )
        s2 = set ( )
        for i in range ( n // 2 ) :
            s1.add ( l [ i ].idx )
        for i in range ( n // 2 , n ) :
            s2.add ( l [ i ].idx )
        m1 = l [ n // 2 ].val
        m2 = l [ n // 2 - 1 ].val
        for i in range ( n ) :
            if i in s1 : self.pln ( m1 )
            else : self.pln ( m2 )
    def _solve1 ( self ) :
        n = self.read_num ( )
        ia = self.read_nums ( )
        for i in range ( n ) :
            na = [ ]
            ni = 0
            for j in range ( n ) :
                if i != j :
                    na.append ( ia [ j ] )
            na.sort ( )
            mi = ( n - 1 ) // 2
            self.pln ( na [ mi ] )
    def _solve ( self ) :
        self.val = val
    def _solve ( self ) :
        self.val = val
    def _pln ( self ) :
        self.val = val
    def _solve ( self ) :
        self.val = val
    return _solve
