def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.d = DataSet ( )
            self.input ( )
            if self.H % self.h == 0 and self.W % self.w == 0 :
                print ( "No" )
            elif self.H % self.h != 0 :
                print ( "Yes" )
                for i in range ( self.H ) :
                    for j in range ( self.W ) :
                        print ( 1000 * self.h - 1001 if i % self.h == 0 else - 1000 , end = " " )
                        if j == self.W - 1 :
                            print ( )
                        else :
                            print ( " " , end = " " )
            elif self.W % self.w != 0 :
                print ( "Yes" )
                for i in range ( self.H ) :
                    for j in range ( self.W ) :
                        print ( 1000 * self.w - 1001 if j % self.w == 0 else - 1000 , end = " " )
                        if j == self.W - 1 :
                            print ( )
                        else :
                            print ( " " , end = " " )
    class DataSet ( object ) :
        def __init__ ( self ) :
            self.H = self.H
            self.W = self.W
            self.h = self.h
            self.w = self.w
