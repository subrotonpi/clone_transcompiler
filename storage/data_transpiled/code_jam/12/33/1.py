def import import os , sys , stdin , stdout , n_case
class C ( object ) :
    def __init__ ( self , count , type ) :
        self.type = type
        self.count = count
    def run ( self , stdin , stdout , n_case ) :
        n = len ( stdin )
        m = len ( stdin )
        l = [ ]
        r = [ ]
        for i in range ( 1 , n_case + 1 ) :
            with open ( stdin , 'r' ) as f :
                for i in range ( 1 , n_case + 1 ) :
                    yield i
        stdout.write ( 'Case #%d: %d\n' % ( n_case , the_max ) )
    def write ( self , stdin , stdout , n_case ) :
        self.type = type
        self.count = n_case
    def run ( self , stdin , stdout , n_case ) :
        self.type = type
        self.count = n_case
    def run ( self , stdin , stdout , n_case ) :
        self.type = type
        self.count = n_case
    def run ( self , stdin , stdout , n_case ) :
        self.type = type
        self.count = n_case
    run ( self , stdin , stdout , n_case )
    ltc = [ ]
    rtc = [ ]
    ans = [ ]
    the_max = 0
    for li in range ( n ) :
        for ri in range ( m ) :
            if li == 0 and ri == 0 or li > 0 and ri > 0 and l [ li - 1 ].type == r [ ri - 1 ].type :
                for lj in range ( li + 1 , n + 1 ) :
                    cl = l [ lj - 1 ]
                    ltc [ cl.type ] += cl.count
                    for rj in range ( ri + 1 , m + 1 ) :
                        cr = r [ rj - 1 ]
                        rtc [ cr.type ] += cr.count
                        if cl.type == cr.type :
                            ans [ lj , rj ] = max ( ans [ lj , rj ] , ans [ li , ri ] + min ( ltc [ cl.type ] , rtc [ cr.type ] ) )
                            the_max = max ( the_max , ans [ lj