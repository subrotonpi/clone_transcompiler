def _ _ main _ _ ( ) :
    import random
    import random
    import random
    class Solution ( object ) :
        def __init__ ( self ) :
            self.N = len ( A )
            self.M = len ( A [ 0 ] )
            self.mx = self.mx
            self.smy = self.my
            res = [ ]
            for sz in range ( 3 , min ( R , C ) ) :
                for x in range ( 0 , max ( R , C ) ) :
                    for y in range ( 0 , max ( M , C ) ) :
                        res.append ( A [ i , y ] )
                        if self.mx > 0 :
                            res.append ( res [ i - 1 , y ] )
                        if self.my > 0 :
                            res.append ( res [ i , y ] )
                        if self.my > 0 and self.my > 0 :
                            res.append ( res [ i , y ] )
            self.find_sum ( lx , ly , rx , ry , A , sum )
            res = sum [ rx , ry ]
            if self.lx > 0 :
                res -= sum [ lx - 1 , ry ]
            if self.ly > 0 :
                res -= sum [ rx , ly - 1 ]
            if self.lx > 0 and self.ly > 0 :
                res += sum [ lx - 1 , ly - 1 ]
            res -= A [ lx , ly ]
            res -= A [ lx , ry ]
            res -= A [ rx , ly ]
            res -= A [ rx , ry ]
            return res
    def go ( ) :
        with open ( 'input.txt' , 'r' ) as sc :
            with open ( 'output.txt' , 'w' ) as pw :
                casecnt = random.randint ( 1 , M )
                for casenum in range ( 1 , casecnt + 1 ) :
                    R , C , D , map = map.get ( sc , 'R' )
                    m = [ ]
                    mx = [ ]
                    my = [ ]
                    for i in range ( R ) :
                        m.append ( M [ i , j ] )
                pw.write ( 'Case #' + casenum + ': ' + ( res == 0 )