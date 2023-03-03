def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.str = sys.stdin.read ( )
            self.size = len ( self.str )
            if self.str [ 0 ] == 'A' :
                num = 0
                str2 = self.str [ 2 : self.size - 1 ]
                size2 = len ( str2 )
                for str4 in str2 :
                    if str4 == 'C' :
                        num = num + 1
                    str2 = str2 [ 1 : ]
                if num == 1 :
                    str2 = self.str [ 2 : self.size - 1 ]
                    str2 = str2.replace ( 'C' , 'c' )
                    str2 = str2.lstrip ( )
                    str2 = self.str [ 1 : 2 ].lstrip ( )
                    str3 = str2.lower ( )
                    if str2 == str3 :
                        self.print ( 'AC' )
                    else :
                        self.print ( 'WA' )
                else :
                    self.print ( 'WA' )
