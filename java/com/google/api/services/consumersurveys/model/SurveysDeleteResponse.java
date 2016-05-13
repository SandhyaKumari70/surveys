/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.consumersurveys.model;

/**
 * Model definition for SurveysDeleteResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Consumer Surveys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SurveysDeleteResponse extends com.google.api.client.json.GenericJson {

  /**
   * Unique request id used for logging and debugging. Please include in any error reporting or
   * troubleshooting requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Unique request id used for logging and debugging. Please include in any error reporting or
   * troubleshooting requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Unique request id used for logging and debugging. Please include in any error reporting or
   * troubleshooting requests.
   * @param requestId requestId or {@code null} for none
   */
  public SurveysDeleteResponse setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public SurveysDeleteResponse set(String fieldName, Object value) {
    return (SurveysDeleteResponse) super.set(fieldName, value);
  }

  @Override
  public SurveysDeleteResponse clone() {
    return (SurveysDeleteResponse) super.clone();
  }

}
