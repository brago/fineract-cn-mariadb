/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.core.mariadb.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

public class LocalDateConverterTest {

  public LocalDateConverterTest() {
    super();
  }

  @Test
  public void shouldConvertLocalDate() {
    final LocalDateConverter converter = new LocalDateConverter();

    final LocalDate expected = LocalDate.of(2017, 1, 1);

    final Date dbDate = converter.convertToDatabaseColumn(expected);

    final LocalDate result = converter.convertToEntityAttribute(dbDate);

    Assert.assertEquals(expected, result);
  }
}
