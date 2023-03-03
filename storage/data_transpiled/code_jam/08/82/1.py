def _import ( ) : return int ( read_word ( ) )
def _import ( ) : return int ( read_word ( ) )
def _import ( ) : return float ( read_word ( ) )
class B :
    problem = "b-large"
    def __init__ ( self ) :
        self.problem = ""
        while True :
            c = self.read ( )
            if c < 0 :
                return ""
            if c > 32 :
                break
        while True :
            self.b.append ( ord ( c ) )
            if c <= 32 :
                break
    def calc ( self ) :
        self.ans = sum ( [ 1 for c1 in self.c ] )
        for c1 in self.c :
            a1 = self.c
            for c2 in self.c :
                a2 = self.c
            main :
                for c3 in self.c :
                    a3 = self.c
                    start = 0
                    cur_ans = 0
                    while start < 10000 :
                        next = max ( max ( a1 [ start ] , a2 [ start ] ) , a3 [ start ] )
                        if next == 0 :
                            continue main
                        start = next
                        cur_ans += 1
                    ans = min ( ans , cur_ans )
            return ans
    def solve ( self ) :
        cases = self.iread ( )
        for i in range ( 1 , cases + 1 ) :
            n = self.n
            color = { }
            self.color = [ ]
            self.cur_color = 0
            for s in self.c :
                a = self.c - 1
                b = self.c
                if s not in color :
                    color [ s ] = cur_color
                    self.d.append ( [ ] )
                    cur_color += 1
                ind = color [ s ]
                data = self.d [ ind ]
                for k in range ( a , b ) :
                    data [ k ] = max ( data [ k ] , b )
            ans = self.calc ( )
            self.out.write ( "Case #%d: " % i )
            if ans == int ( "IMPOSSIBLE" ) :
                self.out.write ( "IMPOSSIBLE\n" )
            else :
                self.