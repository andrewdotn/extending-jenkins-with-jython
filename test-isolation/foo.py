from __future__ import print_function

import sys
import unittest

class TestStringMethods(unittest.TestCase):

  def test_upper(self):
      self.assertEqual('foo'.upper(), 'FOO')

if __name__ == '__main__':
    print(sys.version)
    unittest.main()
