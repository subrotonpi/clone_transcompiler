def _main ( ) : return
class Main ( ) :
    r , c , x , y , d , l = sys.argv [ 1 : ]
    MOD = 1000000007
    def comb_rep ( n , k ) :
        with open ( '/dev/null' ) as f :
            while not f.readline ( ) or not f.readline ( ) :
                try :
                    f.readline ( )
                except IOError :
                    pass
            return int ( f.readline ( ) )
        def __next__ ( ) : return long ( f.readline ( ) )
        def nextDouble ( ) : return float ( f.readline ( ) )
        def readline ( ) :
            data = ''
            try :
                data = f.readline ( )
            except IOError :
                pass
            return data
    def solve ( ) :
        dl = d + l
        comb = Combination ( 900 , MOD )
        ans = 0
        for i in range ( 1 << 4 ) :
            tx = x
            ty = y
            if i & 1 :
                tx -= 1
            if i & 2 :
                tx -= 1
            if i & 4 :
                ty -= 1
            if i & 8 :
                ty -= 1
            if tx < 0 or ty < 0 :
                continue
            if int ( i ) % 2 == 0 :
                ans += comb ( tx * ty , d + l ) * comb ( d + l , d )
            else :
                ans -= comb ( tx * ty , d + l ) * comb ( d + l , d )
            ans = ( ans + MOD ) % MOD
        ans = ans * ( r - x + 1 ) * ( c - y + 1 ) % MOD
        print ( ans )
    class Combination ( ) :
        def __init__ ( self , max , mod ) :
            self.mod = mod
            self.facts = [ ]
            self.invs = [ ]
            self.inv_facts = [ ]
            self.facts.append ( 1 )
            for i in range ( 2 , max + 1 ) :
                self.facts.append ( int ( self.facts [ i - 1 ] * ( mod - mod // i ) % mod ) )
return Main ( )
