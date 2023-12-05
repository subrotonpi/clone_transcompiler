def _import ( ) :
    import sys
    import numpy
    class Matrix :
        def __init__ ( self , row , column ) :
            self.row = r
            self.column = c
            self.mat = [ [ r , c ] for r in range ( row ) ]
        def __str__ ( self ) :
            return "".join ( self.mat )
        def __str__ ( self ) :
            return "".join ( self.mat )
        def mult ( self , * args ) :
            assert self.row == column
            for i in range ( row ) :
                self.row [ i ] = self.row [ i ]
            return self.row
        def mult ( self , * args ) :
            assert self.column == row
            for i in range ( row ) :
                self.row [ i ] = self.column [ i ]
            return self.row [ i ]
        def get ( self , * args ) :
            assert self.row == row
            if self.column == column :
                return self.row [ i ]
        def set ( self , * args ) :
            self.row [ i ] = self.row [ i ]
        def copy ( self , * args ) :
            ans = [ ]
            for r in range ( row ) :
                for c in range ( column ) :
                    ans.insert ( r , c , scalar_plus ( self.get ( r , c ) , * args ) )
            return ans
        def add ( self , * args ) :
            assert self.row == another.row and self.column == another.column
            ans = [ ]
            for r in range ( row ) :
                for c in range ( column ) :
                    ans.insert ( r , c , scalar_minus ( self.get ( r , c ) , * args ) )
            return ans
        def sub ( self , * args ) :
            assert self.row == another.row and self.column == another.column
            ans = [ ]
            for r in range ( row ) :
                for c in range ( column ) :
                    ans.insert ( r , c , scalar_minus ( self.get ( r , c ) , * args ) )
            return ans
    return Matrix ( )
