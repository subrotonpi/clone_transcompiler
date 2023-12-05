def _import ( ) : return
import sys
import string
import list
import list
import ListIterator
import Scanner
class Main ( ) :
    def __init__ ( self ) :
        self.queues = [ [ ] for _ in range ( 26 ) ]
        self.pointers = [ ]
        self.max_count = [ ]
    def sort ( self , start ) :
        if len ( self.pointers ) <= 1 :
            return 0
        self.move = 0
        self.jump_num = start + len ( self.pointers ) / 2
        self.lefts = list ( )
        for pos in self.pointers :
            if pos < self.jump_num :
                self.lefts.append ( pos )
                self.jump_num += 1
            else :
                self.jump_num += 1
        self.left_move = sort ( self.lefts , start )
        self.right_move = sort ( self.right_start , start )
        return self.move + left_move + right_move
    def queue ( self , n ) :
        self.pointers = [ ]
        self.lefts.append ( n )
        self.move_num += 1
        if self.max_count < self.pointers :
            self.max_count += 1
    def dequeue ( self ) :
        self.pointers.pop ( )
        self.move_num -= 1
        return self.queue ( self.left_move , self.move_num )
    def max_count ( self ) :
        return self.max_count
    def is_palindrome ( self , count ) :
        exist_odd = False
        for c in count :
            if c % 2 == 1 :
                if exist_odd :
                    return False
                else :
                    exist_odd = True
        return True
    def solve ( self , line ) :
        count_alphabets = [ 'z' - 'a' + 1 ]
        self.rights = list ( )
        self.left_pos = 0
        self.jump_num = 0
        self.move_num += 1
        self.right_pos = 0
        self.move_num += 1
        self.move_num += 1
