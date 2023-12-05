def _import ( ) : return _import ( '' )
class Main ( object ) :
    def __init__ ( self ) :
        self._fastscan = _fastscan ( )
        self.n = self.n
    def read ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        n = 0
        minus = False
        b = self.read ( )
        if b == '-' :
            minus = True
        if b < '0' or b > sys.maxint :
            raise ValueError ( )
        while True :
            ma = self.read ( 1 )
            self.a.append ( ma )
            num = self.map.get ( ma )
            if num is None :
                self.map [ ma ] = 1
            else :
                self.map [ ma ] = num + 1
        npow = 31
        pow2 = [ int ( pow ( 2 , i + 1 ) ) for i in range ( npow ) ]
        self.a.sort ( )
        ans = 0
        powpos = npow - 1
        for i in range ( len ( self.a ) - 1 , 0 , - 1 ) :
            cur = self.a.pop ( i )
            num1 = self.map.get ( cur )
            if num1 is None or num1 == 0 : continue
            self.map [ cur ] = num1 - 1
            while cur * 2 < self.pow2 [ powpos ] :
                powpos -= 1
            num2 = self.map.get ( self.pow2 [ powpos ] - cur )
            if num2 is not None and num2 > 0 :
                self.map [ self.pow2 [ powpos ] - cur ] = num2 - 1
                ans += 1
        print ( ans )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1024 )
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try : self.buflen = self.buflen
                except AttributeError : pass
                if self.buflen <= 0 : return False
            return True
