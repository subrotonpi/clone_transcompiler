def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w , self.t = self.h , self.w , self.t
        self.c = [ ]
        for i in range ( self.h ) :
            self.c.append ( _main ( i ) )
        self.solve ( )
    def solve ( self ) :
        sh , sw , gh , gw = - 1 , - 1 , - 1 , - 1
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if self.c [ i ] [ j ] == 'S' :
                    sh = i
                    sw = j
                elif self.c [ i ] [ j ] == 'G' :
                    gh = i
                    gw = j
        self.lo , hi = 0 , self.t
        while hi - lo > 1 :
            mid = ( lo + hi ) // 2
            cost = [ ]
            for i in range ( self.h ) :
                [ cost [ i ] ] = INF
            q = Queue ( )
            q.put ( ( self.sw , self.sh ) )
            cost [ sh ] [ sw ] = 0
            while not q.empty ( ) :
                p = q.get ( )
                pw , ph = p.x , p.y
                for i in range ( 4 ) :
                    tw = pw + self.mh4 [ i ]
                    th = ph + self.mw4 [ i ]
                    if tw < 0 or th < 0 or tw >= self.w or th >= self.h :
                        continue
                    a = mid if self.c [ th ] [ tw ] == '#' else 1
                    if cost [ th ] [ tw ] < cost [ ph ] [ pw ] + a :
                        continue
                if cost [ th ] [ tw ] > cost [ ph ] [ pw ] :
                    continue
            if cost [ th ] [ tw ] > cost [ ph ] [ pw ] :
                continue
            if cost [ th ] [ tw ] < cost [ ph ] [ pw ] :
                continue
        return q
return Main
