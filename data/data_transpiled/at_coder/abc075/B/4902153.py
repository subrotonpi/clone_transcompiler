def main ( ) :
    from sys import stdin
    class Main ( object ) :
        def __init__ ( self ) :
            self.B = None
            return
        def A ( self ) :
            with stdin.open ( 'A' ) as f :
                A = f.read ( )
        def B ( self ) :
            with stdin.open ( 'B' ) as f :
                C = f.read ( )
            if A == B :
                print ( C )
            elif B == C :
                print ( A )
            else :
                print ( B )
        def calc8 ( self , cell , h , w ) :
            if cell [ h ] [ w ] == '#' :
                print ( '#' , end = '' )
            else :
                hs = ( h - 1 , h , h + 1 )
                ws = ( w - 1 , w , w + 1 )
                sum = 0
                for nh in hs :
                    for nw in ws :
                        if nh < len ( self.cell ) and nh >= 0 and nw >= 0 and nw < len ( self.cell [ 0 ] ) :
                            if self.cell [ nh ] [ nw ] == '#' :
                                sum += 1
                print ( sum , end = '' )
            if w == len ( self.cell [ 0 ] ) - 1 :
                print ( '' , end = '' )
    def B ( self ) :
        with stdin.open ( 'B' ) as f :
            H = f.read ( )
            W = f.read ( )
            cell = [ ]
            for s in self.cell :
                for j in range ( W ) :
                    cell.append ( s [ j ] )
            for i in range ( H ) :
                for j in range ( W ) :
                    calc8 ( self , cell , i , j )
