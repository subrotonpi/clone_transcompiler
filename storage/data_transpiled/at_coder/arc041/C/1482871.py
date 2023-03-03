def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.l = 0
        self.rq = deque ( )
        self.lq = deque ( )
        ans = 0
        sumi_cnt = 0
        for i in range ( self.n ) :
            x = self.n [ i ]
            direction = self.direction [ 0 ]
            if direction == 'L' :
                if self.rq :
                    cnt = x - 1 - sumi_cnt
                    ans += cnt
                    sumi_cnt += 1
                else :
                    self.lq.append ( x )
            else :
                if self.lq :
                    self.rq.append ( x )
                else :
                    cnt = self.calc ( self.rq , self.lq )
                    ans += cnt
                    self.rq.append ( x )
        if self.lq :
            sumi_cnt = 0
            while self.rq :
                x = self.rq.popleft ( )
                cnt = self.l - x - sumi_cnt
                ans += cnt
                sumi_cnt += 1
        else :
            ans += self.calc ( self.rq , self.lq )
        print ( ans )
    def calc ( self , rq , self.lq ) :
        rx = self.rq.popleft ( )
        rcount = 1
        ans = 0
        while self.rq :
            x = self.rq.popleft ( )
            cnt = rx - x - rcount
            ans += cnt
            rcount += 1
        lx = self.lq.popleft ( )
        lcount = 1
        while self.lq :
            x = self.lq.popleft ( )
            cnt = x - lx - lcount
            ans += cnt
            lcount += 1
        max_cnt = max ( rcount , lcount )
        cnt = max_cnt * ( lx - rx - 1 )
        ans += cnt
        return ans
return Main ( )
