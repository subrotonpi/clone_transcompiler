def _ _ main _ _ ( ) :
    import sys
    import random
    import random
    class ProblemB ( ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.casecnt = sc.count ( )
                    for i in range ( 1 , self.casecnt + 1 ) :
                        if self._fn [ i ] == 1 :
                            self.F [ i ] = 10000
                        else :
                            self.F [ i ] = min ( self.F [ i ] , self.F [ j ] + 1 )
                    if self._fn [ i ] == 10000 :
                        self.res = min ( self.F [ i ] , self.F [ i ] )
            self.do_main ( )
        def do_main ( self ) :
            ( self.casecnt , self.cols , self.colcnt , self.st , self.fn ) = [ ]
            for i in range ( self.casecnt + 1 ) :
                c = sc.next ( )
                find = False
                for j in range ( self.casecnt ) :
                    if self.cols [ j ] == c :
                        self.colcnt.append ( j )
                        find = True
                        break
                    if not find :
                        self.cols.append ( c )
                        self.colcnt.append ( self.casecnt - 1 )
                self.st.append ( self.st [ i ] )
                self.fn.append ( self.fn [ i ] )
            for i in range ( self.casecnt + 1 ) :
                for j in range ( self.casecnt + 1 ) :
                    if self.fn [ j ] > self.fn [ j + 1 ] :
                        tmp = self.fn [ j ]
                        self.fn [ j ] = self.fn [ j + 1 ]
                        self.fn [ j ] = tmp
                        tmp = self.st [ j ]
                        self.st [ j ] = self.st [ j ]
                        self.st [ j ] = self.st [ j ]
                        self.fn [ j + 1 ] = self.fn [ j ]
        return
