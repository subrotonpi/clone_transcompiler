def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        M , A , R , C , H = [ ] , [ ] , [ ] , [ ] , [ ] , [ ]
        for s in sc :
            if s [ 0 ] == 'M' :
                M += 1
            elif s [ 0 ] == 'A' :
                A += 1
            elif s [ 0 ] == 'R' :
                R += 1
            elif s [ 0 ] == 'C' :
                C += 1
            elif s [ 0 ] == 'H' :
                H += 1
        ans = [ ]
        ans.append ( R * C * H )
        ans.append ( A * C * H )
        ans.append ( A * R * C )
        ans.append ( M * C * H )
        ans.append ( M * C * H )
        ans.append ( M * C * H )
        ans.append ( M * C * H )
        ans.append ( M * C * H )
        ans.append ( M * C * H )
        ans.append ( M * A * C )
        ans.append ( M * A * C )
        print ( ans )
