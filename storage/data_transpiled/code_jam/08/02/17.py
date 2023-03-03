def _train_timetable ( ) :
    import time
    import sys
    class TrainTimetable ( object ) :
        class Event ( object ) :
            def __init__ ( self , st , fn , ind ) :
                self.st , self.fn , self.ind = st , fn , ind
                self.st += 1
                self.fn += 1
                self.ind += 1
            def __call__ ( self , other ) :
                return self.st - other.st
        def parse_time ( s ) :
            h = 10 * ( s [ 0 ] - '0' ) + ( s [ 1 ] - '0' )
            m = 10 * ( s [ 3 ] - '0' ) + ( s [ 4 ] - '0' )
            return 60 * h + m
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    self.cases = sc.readlines ( )
                    for case_num in range ( cases ) :
                        pw.write ( 'Case #%d: ' % ( case_num + 1 ) )
                        tt , n_a , n_b = sc.readlines ( )
                        events = [ ]
                        pos = 0
                        for i in range ( n_a ) :
                            events.append ( ( parse_time ( sc.readline ( ) ) , parse_time ( sc.readline ( ) ) , 0 ) )
                        for i in range ( n_b ) :
                            events.append ( ( parse_time ( sc.readline ( ) ) , parse_time ( sc.readline ( ) ) , 1 ) )
                        events.sort ( )
    tA = [ ]
    tB = [ ]
    cA , cB = 0 , 0
    for i in range ( len ( events ) ) :
        if events [ i ].ind == 0 :
            find = False
            for j in range ( len ( tA ) ) :
                if tA [ j ] <= events [ i ].st - tt :
                    tA.remove ( j )
                    find = True
                    break
            tB.append ( events [ i ].fn )
            if cA == events [ i ].ind :
                cA = events [ i ].st - tt
    return tA