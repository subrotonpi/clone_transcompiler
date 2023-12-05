def main ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = open ( "c-large.out" , "w" )
            self.inputs = sys.stdin.read ( )
            for case_num in range ( 1 , self.inputs + 1 ) :
                row = self.rows
                col = self.cols
                total = self.rows * col
                mines = self.mines
                spaces = total - mines
                poss = False
                grid = [ ]
                for i in range ( row ) :
                    [ i , j ] = '*'
                special = False
                ans = 0
                if spaces == 1 :
                    ans = 1
                    special = True
                    grid [ 0 ] [ 0 ] = '.'
                    poss = True
                if col == 1 :
                    ans = spaces
                    poss = True
                    for i in range ( spaces ) :
                        grid [ i ] [ 0 ] = '.'
                    special = True
                if row == 1 :
                    ans = 1
                    poss = True
                    for i in range ( spaces ) :
                        grid [ i ] [ 0 ] = '.'
                    special = True
                if mines == 0 :
                    poss = True
                    ans = col
                    for i in range ( row ) :
                        [ i ] = '.'
                    special = True
                for i in range ( 2 , self.rows + 1 ) :
                    if ( spaces / i == col and spaces % i != 0 ) or ( spaces / i == 2 and spaces % i == 1 ) or spaces / i > col or spaces / i < 2 :
                        continue
                    elif i != 2 or spaces % i != 1 :
                        ans = i
                        poss = True
                        break
            self.stdout.write ( "Case #%d:\n" % case_num )
            if poss :
                if not special :
                    for i in range ( ans ) :
                        for j in range ( 2 , self.rows + 1 ) :
                            grid [ i ] [ j ] = '.'
    return C
