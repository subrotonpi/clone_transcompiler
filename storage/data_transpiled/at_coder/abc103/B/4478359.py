def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.str1 = sys.stdin.readline ( ).strip ( )
            self.str2 = sys.stdin.readline ( ).strip ( )
            if self.str1 == self.str2 :
                print ( 'Yes' )
                return
            str_arr = [ ]
            for i in range ( len ( self.str1 ) - 1 ) :
                str_arr.append ( self.str1 [ i + 1 : ] + self.str1 [ : i + 1 ] )
            for i in range ( len ( str_arr ) ) :
                if str_arr [ i ] == self.str2 :
                    print ( 'Yes' )
                    return
            print ( 'No' )
    return Main ( )
