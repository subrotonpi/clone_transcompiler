def _import ( ) :
    import os
    import sys
    import os
    import sys
    import threading
    class A ( threading.Thread ) :
        FILENAME = 'A-large'
        def solve ( self ) :
            with open ( FILENAME + '.in' , 'r' ) as infile :
                with open ( FILENAME + '.out' , 'w' ) as outfile :
                    self.testn = int ( infile.read ( ) )
                    for test , R , C in enumerate ( infile ) :
                        arr = [ ]
                        impossible = False
                        for line in infile :
                            arr.append ( line )
                        for i in range ( len ( arr ) ) :
                            if impossible :
                                break
                            for j , cur_row , ch in enumerate ( arr ) :
                                if ch == '#' :
                                    n_h = j + 1
                                    n_v = i + 1
                                    if n_h != len ( cur_row ) and n_v != len ( arr ) :
                                        n_row = arr [ n_v ]
                                        if cur_row [ n_h ] == '#' and n_row [ j ] == '#' and n_row [ n_h ] == '#' :
                                            new_cur = [ cur_row ]
                                            new_next = [ n_row ]
                                            new_cur.append ( '/' )
                                            new_cur.append ( '\' ' )
                                            new_next.append ( '\' ' )
                                            arr.append ( '/' )
                                            arr.append ( '/' )
                                        else :
                                            impossible = True
                                            break
                                else :
                                    impossible = True
                                    break
            print ( 'Case #%d:' % ( test + 1 ) , file = outfile )
            if impossible :
                print ( 'Impossible' )
            else :
                for i in range ( len ( arr ) ) :
                    print ( arr [ i ] , file = outfile )
