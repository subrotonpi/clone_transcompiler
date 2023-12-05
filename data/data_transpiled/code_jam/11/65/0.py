def _main ( ) : return
class ProblemE :
    MAX_STEPS = 1000
    class Testcase :
        def __init__ ( self , seed ) :
            self.seed = seed
        def __init__ ( self ) :
            self.seed = self.seed
        def load_input ( self , sc ) :
            self.A = sc.read ( )
            self.M = sc.read ( )
            self.V = sc.read ( )
        def solve ( self , cur , stepsleft ) :
            if self.cur <= 0 : return 0.0
            if self.cur >= self.V : return 1.0
            if self.stepsleft == 0 : return 0.0
            if self.memo [ self.cur ] [ self.stepsleft ] > - 0.5 : return self.memo [ self.cur ] [ self.stepsleft ]
            res = 0.0
            for B in range ( 1 , min ( self.cur , self.M ) + 1 ) :
                max_bets = 1
                tot = B
                while 2 * tot <= self.M :
                    tot *= 2
                    max_bets += 1
                for play in range ( 1 , max_bets + 1 ) :
                    cur_prb = 1.0
                    tmp = 0.0
                    lose , bet = 0 , B
                    for round in range ( play ) :
                        tmp += cur_prb * 0.5 * solve ( self.cur + B , self.stepsleft - 1 )
                        cur_prb *= 0.5
                        lose += bet
                        bet *= 2
                    tmp += cur_prb * solve ( self.cur - lose , self.stepsleft - 1 )
                    res = max ( res , tmp )
            self.memo [ self.cur ] [ self.stepsleft ] = res
            return res
    def solve ( self , A , M , V ) :
        self.ans = [ ]
        for B in range ( 1 , min ( self.A , self.M ) + 1 ) :
            best = 0.0
            max_bets = 1
            tot = B
            while 2 * tot <= self.M :
                tot *= 2
                max_bets += 1
            for play in range ( 1 , max_bets + 1 ) :
                tmp += cur_prb * 0.5 * solve ( self.A + B , self.max_bet )
            