def _solve ( ) :
    import locale
    import sys
    from locale import getpreferredencoding
    from locale import getpreferredencoding
    class B :
        def __init__ ( self , c , j , p , curC ) :
            tn = getpreferredencoding ( )
            for test in range ( 1 , tn + 1 ) :
                c = c [ : ]
                j = c [ : ]
            if c [ : ] == '?' :
                best = findbest ( c , j , 0 , 0 )
                self.stdout = getpreferredencoding ( )
            else :
                best = findbest ( c , j , p , 0 )
                self.stdout = getpreferredencoding ( )
        def __init__ ( self , cj1 , cj2 ) :
            locale.setlocale ( locale.LC_ALL , '' )
            self.stdout = getpreferredencoding ( )
            self.stdout = getpreferredencoding ( )
            self.stdout = getpreferredencoding ( )
            self.stdout = getpreferredencoding ( )
            self.stdout = getpreferredencoding ( )
    def find_best ( c , j , p , curCJ ) :
        if p >= len ( c ) :
            return [ curCJ , curCJ ]
        if c [ : ] != '?' and j [ : ] != '?' :
            if c [ : ] == j [ : ] :
                return findbest ( c , j , p + 1 , curCJ * 10 + c [ : ] - '0' )
            else :
                return findclose ( c , j , p + 1 , curCJ * 10 + c [ : ] - '0' )
        if c [ : ] == '?' :
            if j [ : ] == '?' :
                best = findbest ( c , j , p + 1 , curCJ * 10 )
                best = findclose ( c , j , p + 1 , curCJ * 10 + c [ : ] - '0' )
                return best
        else :
            best = findclose ( c , j , p + 1 , curCJ * 10 + c [ : ] - '0' )
            if j [ : ] > '0' :
                best = findclose ( c , j , p + 1 , curCJ * 10 + c [ : ] - '0' )
            