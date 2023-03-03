def main ( ) :
    import sys
    import os
    import sys
    class ProblemB ( ) :
        def __init__ ( self ) :
            self.d = [ ]
        def get_solution ( self , prefix , add ) :
            dd = self.d.copy ( )
            for i in prefix :
                if i != '0' :
                    dd [ i - '0' ] -= 1
            need = 0
            for i in range ( 1 , 9 ) :
                if i < 0 : return ''
                need += i
            if need > add : return ''
            dd.append ( add - need )
            res = prefix
            for i in range ( 10 ) :
                for j in dd [ i ] :
                    res += '%d' % i
            return res
        def solve ( s ) :
            for s in s [ : - 1 ] :
                for next in ( chr ( ord ( s [ 0 ] ) + 1 ) , chr ( ord ( s [ 1 ] ) + 1 ) , chr ( ord ( s [ 2 ] ) + 1 ) ) :
                    ans = get_solution ( '%s%s' % ( s [ 0 ] , next ) , len ( s ) - len ( next ) - 1 )
                    if not ans in self.d : return ans
            for s in s :
                for st in ( '1' , '9' ) :
                    ans = get_solution ( '%s%s' % ( st , s ) )
                    if not ans in self.d : return ans
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    self.case_cnt = sc.read ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        cur_num = sc.read ( )
                        d = [ ]
                        for i in cur_num :
                            if i != '0' :
                                d [ i - '0' ] += 1
                            pw.write ( 'Case #%d: %s\n' % ( case_num , solve ( cur_num ) ) )
                    pw.flush ( )
