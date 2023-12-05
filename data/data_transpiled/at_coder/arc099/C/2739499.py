def _import ( ) : return sys.stdin
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import io
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
import itertools
def main ( ) :
    input_file = tokenize.open
    output_file = tokenize.open
    reader = tokenize
    stream = open
    writer = tokenize.open
    solver = TaskE ( )
    solver.solve ( 1 , input_file , stream )
    writer.close ( )
class TaskE ( object ) :
    def solve ( self , test_number , input_stream , output_stream ) :
        n = len ( input_stream )
        m = len ( input_stream )
        edges = [ [ True , False ] ] * n
        for from_number , to_number in input_stream :
            edges [ from_number ] [ to_number ] = True
            edges [ to_number ] [ from_number ] = True
        for from_number , to_number in input_stream :
            edges [ from_number ] [ to_number ] = not edges [ from_number ] [ to_number ]
    list1 = [ ]
    list2 = [ ]
    used = [ False ] * n
    for x in itertools.count ( ) :
        if used [ x ] :
            continue
        group = [ 1 ]
        q = deque ( )
        q.append ( i )
        cnt1 = 1
        cnt2 = 0
        used [ x ] = True
        while not q.empty ( ) :
            x = q.popleft ( )
            for j in range ( n ) :
                if j == x :
                    continue
                if edges [ x ] [ j ] == 1 :
                    cnt1 += 1
                else :
                    cnt2 += 1
                q.append ( j )
        list1.append ( cnt1 )
        list2.append ( cnt2 )
