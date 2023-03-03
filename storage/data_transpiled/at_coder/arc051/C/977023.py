def _import ( ) : return
import Queue
import Queue
class Node ( object ) :
    def __init__ ( self , bi , original , count ) :
        self.bi , self.original = bi , original , count
    def __next__ ( self ) : return self.bi
    def next ( self ) : return Node ( bi * self.a , original , count + 1 )
class Main :
    MOD = 1000000007
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def pow ( self , a , b ) :
        if b == 0 :
            return 1
        if b % 2 == 0 :
            v = pow ( a , b // 2 )
            return mul ( v , v )
        else :
            v = pow ( a , b // 2 )
            return mul ( mul ( v , v ) , a )
    def main ( self ) :
        s = Scanner ( )
        n , a , b = s.next ( )
        if a == 1 :
            value = [ ]
            for i in range ( n ) :
                value.append ( s.next ( ) )
            value.sort ( )
            for v in value :
                print ( v )
            return
        self.a = Node ( '%d' % a )
        queue = Queue.Queue ( )
        for i in range ( n ) :
            original = s.next ( )
            queue.put ( Node ( ( '%d' % original , original , 0 ) , original , 0 ) )
        count = 0
        while count < n and b > 0 :
            node = queue.get ( )
            if node.count == 0 :
                count += 1
            b -= 1
            queue.put ( node.next )
        result = deque ( )
        while not queue.empty ( ) :
            node = queue.get ( )
            result.append ( mul ( node.original , pow ( a , node.count + b // n ) ) )
return Main
