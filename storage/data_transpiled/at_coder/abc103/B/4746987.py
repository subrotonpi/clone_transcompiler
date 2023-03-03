def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.str = self.sc.readline ( )
            self.str2 = self.sc.readline ( )
            self.size = len ( self.str )
            self.size2 = len ( self.str2 )
            self.flag = 1
            while True :
                if self.str == self.str2 :
                    break
                else :
                    self.size2 = self.size2 - 1
                    str3 = self.str [ 0 ]
                    self.str = self.str [ 1 : self.size ]
                    self.str = self.str.ljust ( self.size2 )
                    if self.size2 == 0 :
                        self.flag = 0
                        break
    if self.flag == 1 :
        print ( "Yes" )
    else :
        print ( "No" )
