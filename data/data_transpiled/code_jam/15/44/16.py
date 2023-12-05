def _import_csv ( ) :
    import csv
    import csv
    import csv
    import csv
    import locale
    import csv
    import os
    import sys
    class D :
        def __init__ ( self ) :
            self.arrays = [ ]
        def equal_array ( self , array1 , array2 , r , c ) :
            for i in range ( r ) :
                for j in range ( c ) :
                    if array1 [ i , j ] != array2 [ i , j ] :
                        return False
            return True
        def add_if_not_exist ( self , drum , r , c ) :
            exists = False
            rotated = [ ]
            for rotate in range ( 1 , c + 1 ) :
                for i in range ( r ) :
                    for j in range ( c ) :
                        j1 = j + rotate
                        if j1 >= c :
                            j1 -= c
                        rotated.append ( self.arrays [ i , j ] )
                for other in self.arrays :
                    if equal_array ( self , other , r , c ) :
                        exists = True
                        break
                if exists :
                    break
            if not exists :
                self.arrays.append ( rotated )
        def check_row ( self , row , drum , r , c ) :
            for j in range ( c ) :
                number = self.arrays [ row , j ]
                k = 0
                if self.arrays [ row - 1 , j ] == number :
                    k += 1
                if self.arrays [ row , j - 1 ] == number :
                    k += 1
                if self.arrays [ row , j + 1 ] == number :
                    k += 1
                if self.arrays [ row , j ] == number :
                    return False
            return True
    D.check_row ( 0 , 0 , r , c )
    D.check_row ( 0 , 0 , r , c )
    D.check_row ( 0 , 0 , r , c )
    D.check_row ( 0 , 0 , r , c )
    D.check_row ( 0 , 0 , r , c )
    D.check_row ( 0 , 0 , r , c )
    D.check_row ( 0 , 0 , r , c )
